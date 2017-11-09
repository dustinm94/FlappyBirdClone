package com.dustinmcallister.game.state;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dustinmcallister.game.FlappyBirdClone;

/**
 * Created by Dustin on 11/9/2017.
 */

public class PlayState extends State {
    private Texture bird;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        bird = new Texture("bird.png");
        cam.setToOrtho(false, FlappyBirdClone.WIDTH / 2, FlappyBirdClone.HEIGHT / 2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined); // setting up for the viewport I want.
        sb.begin();
        sb.draw(bird, 50,50);
        sb.end();

    }

    @Override
    public void dispose() {

    }
}
