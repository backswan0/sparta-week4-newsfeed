package com.spring.instafeed.follower.dto.response;

import com.spring.instafeed.common.Status;
import com.spring.instafeed.follower.entity.Follower;

public record CreateFollowerResponseDto(
        Long id,
        Long senderProfileId,
        Long receiverProfileId,
        Enum<Status> status
) {
    public static CreateFollowerResponseDto toDto(
            Follower follower
    ) {
        return new CreateFollowerResponseDto(
                follower.getId(),
                follower.getSenderProfile().getId(),
                follower.getReceiverProfile().getId(),
                follower.getStatus()
        );
    }
}