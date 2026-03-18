package service;

import model.Post;
import model_enums.PostType;

public interface IPostPublish {
	public abstract void createAndPublishPost(String inputMsg, PostType inputPostType);

}
