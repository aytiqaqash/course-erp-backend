package com.webperside.courseerpbackend.controller;

import com.webperside.courseerpbackend.models.base.BaseResponse;
import com.webperside.courseerpbackend.models.mappers.GroupEntityMapper;
import com.webperside.courseerpbackend.models.payload.group.GroupPayload;
import com.webperside.courseerpbackend.services.group.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;
    private static final GroupEntityMapper groupEntityMapper =GroupEntityMapper.INSTANCE;

    // todo validation
    @PostMapping
    public BaseResponse<Void> addGroup (@RequestBody GroupPayload groupPayload){
        groupService.insert(groupEntityMapper.toEntity(groupPayload));
        return BaseResponse.success();
    }

    // todo validation
    @PutMapping("/{id}")
    public BaseResponse<Void> updateGroup (@PathVariable("id") long id, @RequestBody GroupPayload groupPayload) {
        groupService.update(groupEntityMapper.toEntity(groupPayload, id));
        return BaseResponse.success();
    }
}
