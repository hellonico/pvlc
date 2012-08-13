/**
 * ##library.name##
 * ##library.sentence##
 * ##library.url##
 *
 * Copyright ##copyright## ##author##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author      ##author##
 * @modified    ##date##
 * @version     ##library.prettyVersion## (##library.version##)
 */

package net.hellonico.pvlc;


import javax.swing.JFrame;

import processing.core.PApplet;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

/**
 * This is a template class and can be used to start a new processing library or tool.
 * Make sure you rename this class as well as the name of the example package 'template' 
 * to your own library or tool naming convention.
 * 
 * @example Hello 
 * 
 * (the tag @example followed by the name of an example included in folder 'examples' will
 * automatically include the example in the javadoc.)
 *
 */

public class pvlcLibrary {
	PApplet myParent;
	EmbeddedMediaPlayerComponent mediaPlayerComponent;
	
	public final static String VERSION = "##library.prettyVersion##";

	public pvlcLibrary(PApplet theParent) {
		myParent = theParent;
		NativeLibrary.addSearchPath(
				RuntimeUtil.getLibVlcLibraryName(), "/Applications/VLC.app/Contents/MacOS/lib/"
		);
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);
		mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
	}
	
	public void play(String filename) {
		System.out.println("Playing "+filename);
	    this.myParent.frame.add(mediaPlayerComponent);
	    mediaPlayerComponent.getMediaPlayer().playMedia(filename);
	    mediaPlayerComponent.getMediaPlayer().setVolume(50);
	}
	
	public void stop() {
		mediaPlayerComponent.getMediaPlayer().stop();
//		mediaPlayerComponent.getMediaPlayer().set
	}
	
	public static String version() {
		return VERSION;
	}

}

