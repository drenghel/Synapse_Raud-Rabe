package fr.synapsegaming.social.dao;

import fr.synapsegaming.commons.dao.Dao;
import fr.synapsegaming.social.entity.ForumPost;
import fr.synapsegaming.user.entity.User;

/**
 * <b>ForumPostDao</b> is the public interface who describe the ForumPost DAO
 * 
 * @author Meidi
 * 
 */
public interface ForumPostDao extends Dao<ForumPost, Long> {

	public long getNbPostByUser(User user);
}
