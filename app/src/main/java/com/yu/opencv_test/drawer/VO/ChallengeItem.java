package com.yu.opencv_test.drawer.VO;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChallengeItem {
    private String title;
    private String content;

    @Builder
    public ChallengeItem(String title, String content){
        this.title = title;
        this.content = content;
    }
}
