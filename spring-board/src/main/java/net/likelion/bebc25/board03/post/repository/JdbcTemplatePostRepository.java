package net.likelion.bebc25.board03.post.repository;

import net.likelion.bebc25.board03.post.dto.PostDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTemplatePostRepository implements PostRepository{

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplatePostRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<PostDto> findAll() {
        return List.of();
    }

    @Override
    public PostDto findById(int id) {
        return null;
    }

    @Override
    public void save(PostDto post) {
        jdbcTemplate.update("INSERT INTO post2 (title, author, content) VALUES (?, ?, ?)"
                , post.getTitle()
                , post.getAuthor()
                , post.getContent());
    }

    @Override
    public void update(PostDto post) {

    }

    @Override
    public void deleteById(int id) {

    }
}
