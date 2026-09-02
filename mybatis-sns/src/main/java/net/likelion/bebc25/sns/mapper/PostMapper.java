package net.likelion.bebc25.sns.mapper;

import net.likelion.bebc25.sns.dto.PostCreateDto;
import net.likelion.bebc25.sns.dto.PostResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    // 1. 단일 DTO 바인딩 (@Param 생략)
    void save(PostCreateDto post);

    // 2. 단일 기본형 바인딩 (@Param 명시)
    PostResponseDto findById(@Param("id") Long id);

    // 3. 단일 기본형 파라미터 기반 목록 조회
    List<PostResponseDto> findByMemberId(@Param("memberId") Long memberId);

    // 4. 다중 파라미터 바인딩 (@Param 필수)
    void update(@Param("id") Long id, @Param("content") String content, @Param("imageUrl") String imageUrl);

    // 5. 단일 기본형 단건 삭제
    void deleteById(@Param("id") Long id);
}
