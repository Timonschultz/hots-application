package nl.timonschultz.hots.core.dataimport.MapImportService;

import lombok.AllArgsConstructor;
import nl.timonschultz.hots.core.map.mapper.MapInputModelMapper;
import nl.timonschultz.hots.core.map.model.MapInputModel;
import nl.timonschultz.hots.persistence.map.MapEntityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class MapImportService {

    private MapInputModelMapper mapInputModelMapper;
    private MapEntityRepository mapEntityRepository;

    public void add(final MapInputModel mapInputModel) {
        System.out.println(mapInputModel.getName());
        mapEntityRepository.save(mapInputModelMapper.mapToEntiy(mapInputModel));
    }

}
