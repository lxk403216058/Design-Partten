package org.example.facade;

public class HomeTheaterFacade {
    //定义各个子系统的对象

    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private DVDPlayer dvdPlayer;
    private Screen screen;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.screen = Screen.getInstance();
    }

    //操作分成四步

    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    //播放

    public void play() {
        dvdPlayer.play();
    }

    //暂停

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();

    }

}
