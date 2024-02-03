package org.zyz;
    
import org.json.JSONObject;

public class IPCCommunication {
    private final EventDispatcher dispatcher;

    public IPCCommunication(EventDispatcher dispatcher) {  // dispatcher 在main中创建，传入IPC中
        this.dispatcher = dispatcher;
    }

}
