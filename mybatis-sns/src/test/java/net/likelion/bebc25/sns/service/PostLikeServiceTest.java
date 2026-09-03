package net.likelion.bebc25.sns.service;

import net.likelion.bebc25.sns.dto.LikeToggleResponseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class PostLikeServiceTest {

    @Autowired
    private PostLikeService postLikeService;

    @Test
    @DisplayName("좋아요 토글 등록, 카운트 증가 테스트")
    void toggleLikeAddTest(){
        // given: 1번 회원이 2번 게시글에 좋아요 시도
        Long memberId = 1L;
        Long postId = 2L;


        // when: 좋아요 토글
        LikeToggleResponseDto result = postLikeService.toggleLike(memberId, postId);

        // then

    }
}
