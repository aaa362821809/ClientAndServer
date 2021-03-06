
package server;

import com.jme3.network.Message;


public interface ServerNetworkListener {
    public void messageReceived(Message msg);
    public Message newConnectionReceived(int connectionID) throws Exception;
}
