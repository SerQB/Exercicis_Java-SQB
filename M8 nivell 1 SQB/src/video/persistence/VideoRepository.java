package video.persistence;

import java.util.ArrayList;
import java.util.List;

import video.domain.Usuari;
import video.domain.Video;

public class VideoRepository {

	private static List<Video> videos=new ArrayList<>();

	public VideoRepository() {
		
	}
	public List<Video> getAllVideos(){
		return new ArrayList<>(videos);
	}
	
	public void addVideo(Video vid) throws Exception{
		if(vid==null) throw new Exception();
		videos.add(vid);
	}

}

	

