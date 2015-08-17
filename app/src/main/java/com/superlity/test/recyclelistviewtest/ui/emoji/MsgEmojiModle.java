package com.superlity.test.recyclelistviewtest.ui.emoji;

/**
 * @author Weiliang Hu
 * @desc <pre>
 * 表情数据模型
 * </pre>
 * @Date 2013-12-11
 */
public class MsgEmojiModle {
    /**
     * 表情资源图片对应的ID
     */
    private int id;

    /**
     * 表情资源对应的文字描述
     */
    private String character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

}
