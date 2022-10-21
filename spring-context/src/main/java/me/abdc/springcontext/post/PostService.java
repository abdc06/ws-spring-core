package me.abdc.springcontext.post;

public class PostService {

    final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }
}
