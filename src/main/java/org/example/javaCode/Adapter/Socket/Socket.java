package org.example.javaCode.Adapter.Socket;

public class Socket {
    public static void testSocket(){
        AmericanSocket americanSocket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        SocketAdapter adapter = new SocketAdapter(americanSocket);
        radio.listenMusic(adapter);
    }
    interface EuroSocket {
        void getPower();
    }

    interface AmericanSocket {
        void getPower();
    }
    static class SimpleAmericanSocket implements AmericanSocket {

        @Override
        public void getPower() {
            System.out.println("get 110 volts...");
        }
    }

   static class Radio {
        public void listenMusic(EuroSocket euroSocket) {
            euroSocket.getPower();
        }
    }
    static class SocketAdapter  implements EuroSocket {
        private final AmericanSocket socket;
        public SocketAdapter(AmericanSocket socket) {
            this.socket = socket;
        }
        @Override
        public void getPower() {
            socket.getPower();
        }
    }
}
