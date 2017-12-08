package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import org.cocos2d.opengl.*;
import org.cocos2d.nodes.*;
import org.cocos2d.layers.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
		CCGLSurfaceView ccglsurfaceview=new CCGLSurfaceView(this);
		
		setContentView(ccglsurfaceview);
		
		CCDirector.sharedDirector().attachInView(ccglsurfaceview);
		//将视图连接
		
		CCDirector.sharedDirector().setDisplayFPS(true);
		//显示fps
		
		CCDirector.sharedDirector().setAnimationInterval(1.0f/60);
		//设置为人眼的帖数
		
		CCDirector.sharedDirector().setDeviceOrientation(
		 CCDirector.kCCDeviceOrientationPortrait);
		//设置竖屏显示
		CCDirector.sharedDirector().setScreenSize(400,800);
		//设置屏幕宽度大小
		
		
		CCScene ccscene=CCScene.node();//创建一个场景 用来显示游戏画面
		
		ccscene.addChild(new MyCCLayer());
		CCDirector.sharedDirector().runWithScene(ccscene);
		 
    }

	@Override
	protected void onResume()
	{
		// TODO: Implement this method
		super.onResume();
		CCDirector.sharedDirector().onResume();
	}

	@Override
	protected void onPause()
	{
		// TODO: Implement this method
		super.onPause();
		CCDirector.sharedDirector().onPause();
	}

	@Override
	protected void onDestroy()
	{
		// TODO: Implement this method
		super.onDestroy();
		CCDirector.sharedDirector().end();
	}

	
	
	
	
	
	
	
	
}
