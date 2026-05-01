package io.github.unlp_oo.archetype;

public class VideoStreamAdapter extends Media{
	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream videoStream) {
		this.videoStream = videoStream;
	}
	
	//hago el llamado a reproduce bajo el nombre play asi las interfaces son compatibles
	public void play() {
		this.videoStream.reproduce();
	}
	
}
