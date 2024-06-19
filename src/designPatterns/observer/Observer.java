package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    interface Channel{
        void update (String news);
        void printNews();
    }

    class NewsAgency{
        private List<Channel> channels = new ArrayList<>();

        public void addObserver(Channel channel) {
            this.channels.add(channel);
        }

        public void removeObserver(Channel channel) {
            this.channels.remove(channel);
        }

        public void setNews(String news) {
            for (Channel channel : channels) {
                channel.update(news);
            }
        }
    }


    class NewsChannel implements Channel {
        private List<String> newsList = new ArrayList<>();

        @Override
        public void update(String news) {
            newsList.add(news);
        }

        @Override
        public void printNews() {
            for (String news: newsList) {
                System.out.println("NewsChannel kanali: "+news);
            }
        }
    }

    void observerDemo(){
        Channel channel1 = new NewsChannel();

        NewsAgency agency = new NewsAgency();
        agency.addObserver(channel1);

        agency.setNews("Bakıda yol qəzası oldu.");
        agency.setNews("Sabahdan yağışlar yağacaq.");
        agency.setNews("Universitetlər tətil edildilər.");

        channel1.printNews();
    }

    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.observerDemo();
    }
}
