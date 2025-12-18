package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
@Embeddable
public class OptionVote {

    private String voteOption;
    private Long voteCount = 0L;
}
