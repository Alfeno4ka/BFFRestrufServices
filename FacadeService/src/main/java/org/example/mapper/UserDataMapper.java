package org.example.mapper;

import org.example.dto.frontal.OrderDataDto;
import org.example.dto.frontal.OrderEntryDataDto;
import org.example.dto.frontal.UserDataDto;
import org.example.dto.integration.OrderDto;
import org.example.dto.integration.OrderEntryDto;
import org.example.dto.integration.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserDataMapper {

    /**
     * Преобразовать в агрегированный типа модели данных пользователя и его заказов.
     *
     * @param from данные о пользователе из сервиса пользователей
     * @param orders данные о заказах пользователя из сервиса заказов
     * @return результат в виде {@link UserDataDto}
     */
    UserDataDto mapToUserDataDto(UserDto from, List<OrderDto> orders);

    List<OrderDataDto> toOrderDataDtoList(List<OrderDto> from);
    List<OrderEntryDataDto> toOrderEntryDataDtoList(List<OrderEntryDto> from);
    OrderDataDto toOrderDataDto(OrderDto from);
    OrderEntryDataDto toOrderEntryDataDto(OrderEntryDto from);
}
