package com.spring.instafeed.follower.service;

import com.spring.instafeed.base.Status;
import com.spring.instafeed.follower.dto.response.FollowerResponseDto;
import com.spring.instafeed.follower.dto.response.UpdateFollowerResponseDto;
import com.spring.instafeed.follower.repository.FollowerRepository;
import com.spring.instafeed.profile.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FollowerServiceImpl implements FollowerService {
    private final FollowerRepository followerRepository;
    private final ProfileRepository profileRepository;

    @Override
    public FollowerResponseDto sendFollowRequest(Long senderId, Long receiverId) {
        // todo

//        Profile sendingProfile = profileRepository.findByIdOrElseThrow(senderId);
//        Profile receivingProfile = profileRepository.findByIdOrElseThrow(receiverId);
//
//        Follower follower = new Follower(
//                sendingProfile,
//                receivingProfile,
//                Status.PENDING
//        );
//
//        Follower savedFollower = followerRepository.save(follower);
//
//        return FollowerResponseDto.toDto(savedFollower);
        return null;
    }

    @Override
    public List<FollowerResponseDto> findAll() {

        List<FollowerResponseDto> allFollowers = new ArrayList<>();

        allFollowers = followerRepository.findAll()
                .stream()
                .map(FollowerResponseDto::toDto)
                .toList();

        return allFollowers;
    }

    @Transactional
    @Override
    public UpdateFollowerResponseDto updateFollowingStatus(Long id, Long requestSenderId, Status status) {

        // todo
//        Profile sendingRequestProfile = profileRepository.findByIdOrElseThrow(requestSenderId);
//        Profile receivingProfile = profileRepository.findByIdOrElseThrow(id);
//
//        Follower follower = new Follower(
//                sendingRequestProfile,
//                receivingProfile,
//                status
//        );
//
//        Follower savedFollower = followerRepository.save(follower);
//
//        return UpdateFollowerResponseDto.toDto(savedFollower);

        return null;
    }
}