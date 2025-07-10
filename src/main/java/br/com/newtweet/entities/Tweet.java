package br.com.newtweet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    @Column(length = 100)
    private User user;

    private String content;

    @CreationTimestamp
    @Column(name = "creation_timestamp")
    private Instant creationTimestamp;
}
