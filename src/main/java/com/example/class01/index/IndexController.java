package com.example.class01.index;

import com.example.class01.posts.domain.dto.PostResponseDto;
import com.example.class01.posts.service.PostService;
import com.example.class01.users.domain.vo.Users;
import com.example.class01.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.stream.IntStream;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final PostService postService;
    private final UserService userService;

    @GetMapping("/")
    public String index(Model model, @PageableDefault(size = 10) Pageable pageable){
        Page<PostResponseDto> postByPageNumber = postService.findPostByPageNumber(pageable);

        model.addAttribute("posts", postByPageNumber);
        model.addAttribute("prev", pageable.previousOrFirst().getPageNumber() + 1);
        model.addAttribute("next", pageable.next().getPageNumber() + 1);
        model.addAttribute("hasPrev", pageable.hasPrevious());
        model.addAttribute("hasNext", postByPageNumber.hasNext());
        model.addAttribute("totalPageCount", IntStream.rangeClosed(1, postByPageNumber.getTotalPages()).toArray());

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @PostMapping("/join")
    public String join (Users user){
        userService.save(user);
        return "redirect:/";
    }

}
