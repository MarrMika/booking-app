package com.example.demo.services;

import com.example.demo.domains.Blocking;
import com.example.demo.repositories.BlockingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlockingServiceImpl implements BlockingService {

    private BlockingRepository blockingRepository;

    @Autowired
    public BlockingServiceImpl(BlockingRepository blockingRepository) {
        this.blockingRepository = blockingRepository;
    }

    @Override
    public Blocking findById(String id) {

        return blockingRepository.getOne(id);
    }

    @Override
    public List<Blocking> findAll() {

        return blockingRepository.findAll();
    }

    @Override
    public void deleteById(String id) {

        blockingRepository.deleteById(id);

    }

    @Override
    public Blocking update(Blocking blocking) {

        return blockingRepository.save(blocking);
    }


}
