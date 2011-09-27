package de.uxnr.amf.v3.type;

import java.io.DataInputStream;
import java.io.IOException;

import de.uxnr.amf.AMF_Context;
import de.uxnr.amf.v3.base.U29;

public class Integer extends U29 {
	public Integer() {
		this.signed = true;
	}
	
	public Integer(int value) {
		this.signed = true;
		this.set((long) value);
	}
	
	public Integer(AMF_Context context, DataInputStream input) throws IOException {
		this.signed = true;
		this.read(context, input);
	}
}
