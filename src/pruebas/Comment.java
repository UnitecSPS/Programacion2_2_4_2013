/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Gotcha
 */
class Comment {
    private int numPost;
    private String body;

    public Comment(int numPost, String body) {
        this.numPost = numPost;
        this.body = body;
    }

    public int getNumPost() {
        return numPost;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return body;
    }
    
    
}
