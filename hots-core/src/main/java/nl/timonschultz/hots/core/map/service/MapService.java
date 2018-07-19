package nl.timonschultz.hots.core.map.service;

import lombok.RequiredArgsConstructor;
import nl.timonschultz.hots.core.map.mapper.MapModelMapper;
import nl.timonschultz.hots.core.map.model.MapInputModel;
import nl.timonschultz.hots.persistence.map.MapEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class MapService {

    private final MapModelMapper mapModelMapper;
    private final MapEntityRepository mapEntityRepository;

    public void add(final MapInputModel mapInputModel) {
        System.out.println(mapInputModel.getName());
        mapEntityRepository.save(mapModelMapper.toEntity(mapInputModel));
    }

}