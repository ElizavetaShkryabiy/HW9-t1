package ru.netology.vk;

public class VKPost {
    private int postId;
//    private int ownerId;
    private int autorId;
    private int date;
//    private boolean isPinned;
//    private Action action;
    private Like like;
    private CommentsInfo commentsInfo;
    private Share shareInfo;
    private long viewer;

    private String imageUrl;
    private String articleUrl;
    private String name;
    private boolean buttonRead;
    private boolean favourite;
    private String text;


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public int getAutorId() {
        return autorId;
    }

//    public int getOwnerId() {
//        return ownerId;
//    }
//
//    public void setOwnerId(int ownerId) {
//        this.ownerId = ownerId;
//    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

//    public boolean isPinned() {
//        return isPinned;
//    }
//
//    public void setPinned(boolean pinned) {
//        isPinned = pinned;
//    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Like getLike() {
        return like;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Share getShareInfo() {
        return shareInfo;
    }

    public void setShareInfo(Share shareInfo) {
        this.shareInfo = shareInfo;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isButtonRead() {
        return buttonRead;
    }

    public void setButtonRead(boolean buttonRead) {
        this.buttonRead = buttonRead;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommentsInfo getCommentsPage() {
        return commentsInfo;
    }

    public void setCommentsPage(CommentsInfo commentsPage) {
        this.commentsInfo = commentsPage;
    }

    public long getViewer() {
        return viewer;
    }

    public void setViewer(long viewer) {
        this.viewer = viewer;
    }


}
