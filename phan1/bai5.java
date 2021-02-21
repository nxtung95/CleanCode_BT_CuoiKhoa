import java.util.ArrayList;

public class User {
   private long id;
   private String fullName;
   private ArrayList<Post> posts;
   private ArrayList<Comment> comments;

   public void writePost(Post post) {
	   this.posts.add(post);
   }

   public void deletePost(Post post) throws PostException {
	   this.posts.remove(post);
	   post.delete();
   }
   
   public void writeComment(Post post, Comment comment) {
	   this.comments.add(comment);
	   post.addComment(comment);
   }
   
   public void deleteComment(Post post, Comment comment) throws CommentException {
	   if (!this.comments.contains(comment)) {
		   System.out.println("Cannot delete other people's comment!");
		   break;
	   }
	   this.comments.remove(comment);
	   post.deleteComment(comment);
   }
   
}

public class Post {
   private long id;
   private String title;
   private String content;
   private User author;
   private ArrayList<Comment> comments;
   
   public void delete() {
	   System.out.println("Delete post");
	   this.comments.clear();
   }
   
   public void addComment(Comment comment) {
	   this.comments.add(comment);
   }
   
   public void deleteComment(Comment comment) {
	   this.comments.remove(comment);
	   comment.delete();
   }
}

private class Comment {
   private long id;
   private String title;
   private Post post;
   private User author;
   
   public void delete() {
	   System.out.println("Delete comment");
   }
}