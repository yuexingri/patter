package com.patter.template;

import java.awt.Graphics;

import javax.swing.JFrame;

public class FrameDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameDemo(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		String msg = "I'm rule";
		g.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		FrameDemo demo = new FrameDemo("whf frame");
	}
}
