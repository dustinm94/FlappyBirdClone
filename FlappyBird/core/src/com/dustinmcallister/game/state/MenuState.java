package com.dustinmcallister.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.dustinmcallister.game.FlappyBirdClone;

/**
 * Created by Dustin on 11/9/2017.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;
    public MenuState(com.dustinmcallister.game.state.GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
            dispose(); // disposing after using frees up memory and prevents memory leaks.
        }

    }

    @Override
    public void update(float dt) {
        handleInput();


    }

    @Override
    public void render(SpriteBatch sb) { // needs to open and close.
        sb.begin(); // opens
        sb.draw(background, 0,0, FlappyBirdClone.WIDTH, FlappyBirdClone.HEIGHT);
        sb.draw(playBtn, (FlappyBirdClone.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyBirdClone.HEIGHT / 2);
        sb.end(); // closes

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}
