package ru.almaz.server.manager;

import ru.almaz.server.model.Topic;
import ru.almaz.server.model.Vote;

import java.util.Optional;

public class VoteManager {

    public static boolean isVoteInTopicExists(Topic topic, String voteName) {
        return topic.getVotes()
                .stream()
                .anyMatch(vote -> vote.getName().equals(voteName));
    }

    public static Optional<Vote> findVoteByTopic(Topic topic, String voteName) {
        return topic.getVotes()
                .stream()
                .filter(vote -> vote.getName().equals(voteName))
                .findFirst();
    }
}
