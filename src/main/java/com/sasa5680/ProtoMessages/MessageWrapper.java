package com.sasa5680.ProtoMessages;
import com.google.protobuf.Any;
import com.sasa5680.ProtoMessages.GeneralOuterClass.General;

public class MessageWrapper {
	
	
	
	public static General Wrap_Message(com.google.protobuf.Message inner) {
		
		Any any = Any.pack(inner);
		General msg = General.newBuilder()
							 .addInnerMSG(any)
							 .setMessageType(inner.getClass().getSimpleName())
							 .build();
		return msg;
	}
	
}
