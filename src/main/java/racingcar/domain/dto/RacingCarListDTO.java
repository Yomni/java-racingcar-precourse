package racingcar.domain.dto;

import java.util.List;

public class RacingCarListDTO {
    private final List<RacingCarDTO> carDtoList;

    public RacingCarListDTO(List<RacingCarDTO> carDtoList) {
        this.carDtoList = carDtoList;
    }

    public List<RacingCarDTO> getCarDtoList() {
        return carDtoList;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (RacingCarDTO dto : carDtoList) {
            sb.append(dto);
            sb.append("\n");
        }
        return sb.toString();
    }
}
