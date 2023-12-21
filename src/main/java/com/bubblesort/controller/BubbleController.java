package com.bubblesort.controller;

import com.bubblesort.contract.request.BubbleRequest;
import com.bubblesort.contract.response.BubbleResponse;
import com.bubblesort.service.BubbleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bubble-sort")
@RequiredArgsConstructor
public class BubbleController {
    @Autowired
    public final BubbleService bubbleService;

    @PostMapping("/sort")
    public BubbleResponse bubbleSort(@RequestBody BubbleRequest bubbleRequest){
        return bubbleService.sort(bubbleRequest.getNumbers());
    }

}
