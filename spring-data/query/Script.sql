        SELECT 
            p.id AS post_id,
            p.content AS post_content,
            p.image_url AS post_image_url,
            p.created_at AS post_created_at,
            m.id AS member_id,
            m.nickname AS member_nickname,
            m.profile_image AS member_profile_image,
            c.id AS comment_id,
            c.member_id AS commenter_id,
            cm.nickname AS commenter_nickname,
            c.content AS comment_content,
            c.created_at AS comment_created_at
        FROM post p
        INNER JOIN member m ON p.member_id = m.id
        LEFT JOIN comment c ON p.id = c.post_id
        LEFT JOIN member cm ON c.member_id = cm.id
        WHERE p.id = #{id}
        ORDER BY c.id ASC