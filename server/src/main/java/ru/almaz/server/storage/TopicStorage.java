package ru.almaz.server.storage;

import ru.almaz.server.model.Topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class TopicStorage {
    private static List<Topic> topics = new ArrayList<>();

    public boolean isTopicExists(String topicName) {
        return topics.stream().anyMatch(topic -> topic.getName().equals(topicName));

    }

    public void saveTopic(Topic topic) {
        topics.add(topic);
    }

    public Optional<Topic> findTopicByName(String topicName) {
        return topics.stream()
                .filter(topic -> topic.getName().equals(topicName))
                .findFirst();
    }

    public List<Topic> findAllTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        TopicStorage.topics = topics;
    }
}
