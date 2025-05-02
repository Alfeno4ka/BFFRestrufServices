truncate table bff_restful_services.dat_orders cascade;

INSERT INTO bff_restful_services.dat_orders (id, user_id, amount, currency)
VALUES ('3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 'd4e8a3f0-1c35-4db5-8db9-3209a3fdf3c2', 149.99, 'USD'),
       ('591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 'd4e8a3f0-1c35-4db5-8db9-3209a3fdf3c2', 45.50, 'USD'),
       ('c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 'd4e8a3f0-1c35-4db5-8db9-3209a3fdf3c2', 320.00, 'USD'),
       ('2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 'f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 89.99, 'USD'),
       ('49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 'f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 12.75, 'USD'),
       ('e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 'f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 500.00, 'USD'),
       ('06cbe949-68c0-4aa1-9e60-e964524dc2a4', 'f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 250.00, 'USD'),
       ('a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 'f28b2c11-634e-4f55-8a67-b0b80c31a0e6', 67.45, 'USD'),
       ('adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 'a7cd2d99-50b8-4c5f-a2f6-5f63d7a8d1ff', 135.00, 'USD'),
       ('b1d43e99-80a2-4120-8c0d-9e646c2a70be', 'a7cd2d99-50b8-4c5f-a2f6-5f63d7a8d1ff', 75.25, 'USD');


-- Entries for order_id 3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('b712e9c1-1d29-4f34-9af7-830c6bfb43aa', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 1, 'Widget A', 10),
       ('c3be3e63-6cf3-45f5-a8c2-8e4dc2e39617', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 2, 'Widget B', 5),
       ('0d57de85-4b89-4f20-89cb-3c53b9bdfd01', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 3, 'Gadget A', 2),
       ('f15cb7e2-f31e-4b4e-b9ee-63cbb62a6617', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 4, 'Gadget B', 7),
       ('e3ccde62-0880-4b35-bb9f-0dc93f6d5d6b', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 5, 'Sprocket A', 3),
       ('5c8743ef-08c5-45de-b95e-04a7a3ef57e9', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 6, 'Sprocket B', 8),
       ('f5e6a154-dc7b-4a76-a4db-9401ac214bc6', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 7, 'Bolt A', 50),
       ('fd502c77-62f1-4488-9610-bb91b3d1d889', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 8, 'Bolt B', 40),
       ('e47fa0b9-2412-4b55-82dc-d058deee64b5', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 9, 'Nut A', 60),
       ('3ef1fd34-d998-41a9-bc4e-8e1709839ce1', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 10, 'Nut B', 70),
       ('05f4f191-d328-4cb7-94fc-dbbdc7b373ae', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 11, 'Bracket A', 6),
       ('4cce473b-17c1-4298-8c6b-4fd67665b297', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 12, 'Bracket B', 4),
       ('b2b823a2-cf8f-4017-bb8c-8c1a9b1296b1', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 13, 'Panel A', 1),
       ('c2349c92-1b9a-47b4-b2de-68ccf1e3dd4e', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 14, 'Panel B', 3),
       ('36c35b0a-2617-4c42-a707-dfb489f4f663', '3d9a2a8a-b84e-4d69-89df-1e2d64f6b4a2', 15, 'Frame A', 2);

-- Entries for order_id: 591d88f5-e7a1-4bb2-92e6-41fc52e8d29f
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('2757054f-8235-4d6e-bb8d-d7b0454a81d2', '591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 1, 'Servo Motor', 2),
       ('519546ef-6d40-4892-8a49-c7f8cfe64fc3', '591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 2, 'Linear Rail', 4),
       ('42f15628-6045-40d8-9499-fcf8e7fe0b79', '591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 3, 'End Stop', 1),
       ('77264518-39e6-48e1-a519-d0fbb3c1ffab', '591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 4, 'Sensor Bracket', 5),
       ('76cc1f89-3d89-4ee2-b6dc-3689ef986be5', '591d88f5-e7a1-4bb2-92e6-41fc52e8d29f', 5, 'Limit Switch', 3);

-- Entries for order_id: c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('1cb2cb2a-24bb-4341-8095-665313afba6d', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 1, 'Nozzle Tip', 10),
       ('9b9e57d3-9a1a-4ed2-8661-94e232053b8e', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 2, 'Filament Guide', 7),
       ('10e3eb39-0915-4984-b6b4-50a8d08c325e', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 3, 'Heat Sink', 3),
       ('46d74f29-5dd2-4e2a-9d86-4a6b1c3490a7', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 4, 'Thermal Pad', 2),
       ('8fda9ae0-7fbd-4e00-8511-6b2a0ae0e20f', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 5, 'Extruder Gear', 8),
       ('3a1dbb02-d845-4e4e-9820-f6ad69db0073', 'c12785ae-55a6-4a5d-a6cd-ea81d6a5dfc4', 6, 'Heater Cartridge', 1);

-- Entries for order_id: 2e9eaaeb-1948-4e31-a163-2a5df8b7b97a
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('b024a328-0c62-4d55-9e84-010d2c8cdbeb', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 1, 'Timing Pulley', 4),
       ('aa38530e-66f4-4ea8-91c7-0f9b6c181ba3', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 2, 'Belt Tensioner', 2),
       ('3cc5d2e7-800e-4178-a509-ef9820a6e177', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 3, 'Stepper Driver', 5),
       ('4dc4736d-3690-48b0-83cb-7b2b162efedc', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 4, 'Mounting Plate', 6),
       ('5ff4e15b-bafd-4f3b-9091-33df82069c08', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 5, 'Cable Chain', 2),
       ('df37e79e-4eae-4701-94b0-80f49a377180', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 6, 'Limit Arm', 3),
       ('44e947d0-42e1-4bd7-a029-0b2f4b295d1d', '2e9eaaeb-1948-4e31-a163-2a5df8b7b97a', 7, 'Encoder Wheel', 1);

-- Entries for order_id: 49e984af-b2c2-42f0-a8dc-5a2d89f73b51
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('c7427f0d-eaa3-45e2-9738-7b574f3a3f26', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 1, 'Shield Panel', 6),
       ('b1c3c26e-e216-474f-8dbe-21dbe2234b47', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 2, 'Spacer Rod', 4),
       ('631e6ee3-94ee-43b6-90a1-4d7c511e10b4', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 3, 'Cooling Fan', 3),
       ('243a7a30-25d2-4b86-b3fc-d07d6b09da40', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 4, 'Power Adapter', 1),
       ('9eb16e6c-cbf3-4e2e-a297-993ed3474c87', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 5, 'Rubber Foot', 12),
       ('bbf39256-bce3-4ff2-8c7a-74a31b9e777d', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 6, 'Cover Cap', 2),
       ('48ac710f-8e1d-4047-9e3e-f0333fe7f833', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 7, 'Wiring Loom', 3),
       ('08371b01-57c7-4a83-8b3a-1f75e0b9cd85', '49e984af-b2c2-42f0-a8dc-5a2d89f73b51', 8, 'Retaining Clip', 6);

-- Entries for order_id: e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('c7e9b4b2-6a13-4da5-87b5-08b8ed739c33', 'e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 1, 'Power Supply', 2),
       ('5e7231a0-0f4f-423b-8b2d-993b8e3d577d', 'e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 2, 'Cooling Fan', 4),
       ('a64fcd82-f859-47b0-b8b8-b79d48e1e209', 'e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 3, 'Heatsink', 5),
       ('87642ffb-0bc4-4c4d-b77e-91f8979d2590', 'e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 4, 'Thermal Paste', 3),
       ('2b7a3159-bdb5-4f73-91f1-8b9baf8703c6', 'e023f4e3-5a33-4d6c-8f7e-9424b15ffdfa', 5, 'Rubber Foot', 6);

-- Entries for order_id: 06cbe949-68c0-4aa1-9e60-e964524dc2a4
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('acf9ab69-d720-4068-a0e0-bd7bfeec84f7', '06cbe949-68c0-4aa1-9e60-e964524dc2a4', 1, 'Button Switch', 3),
       ('3456b062-c58f-4fc7-8db2-3069050a253d', '06cbe949-68c0-4aa1-9e60-e964524dc2a4', 2, 'Display Screen', 5),
       ('21c2d31d-6f28-4685-8ac7-44021569c021', '06cbe949-68c0-4aa1-9e60-e964524dc2a4', 3, 'LED Strip', 7),
       ('db60eaff-b01e-4691-b726-d0f35a9a0c33', '06cbe949-68c0-4aa1-9e60-e964524dc2a4', 4, 'Power Adapter', 2),
       ('a1ab0ea3-6939-4732-b7c9-73d2be4e85d6', '06cbe949-68c0-4aa1-9e60-e964524dc2a4', 5, 'Charging Dock', 8);

-- Entries for order_id: a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('03b7b0be-67c0-48f6-bf57-d1d72e7f84d0', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 1, 'Fan Blade', 5),
       ('22d7e42a-6a4d-4875-9831-c67e98ccf03f', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 2, 'Motor Mount', 3),
       ('f13d0f40-0f3c-4b88-b1f3-c417d08ea178', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 3, 'Gear Set', 4),
       ('3d7e0d02-3fbe-4973-b663-c19f6979e728', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 4, 'Axle', 6),
       ('c98e47b0-6d57-44a7-9a4c-8019ed705b6a', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 5, 'Pulley Set', 8),
       ('8adfc8fd-620e-441f-b00f-66c4744a8355', 'a0b7a2e4-b790-41be-b9a7-bbfa8b10adbb', 6, 'Controller Unit', 2);

-- Entries for order_id: adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('fc778b3f-c0cc-4c5d-9a39-6cd9cb1c03f5', 'adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 1, 'Motor Controller', 3),
       ('12e1b5f7-5f84-43de-bd78-622ae4c8f6d5', 'adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 2, 'Gearbox Assembly', 4),
       ('5b306c91-d2d5-47da-8328-5f9a3d17ef72', 'adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 3, 'Belt Tensioner', 2),
       ('a02f6c25-1a5a-4c7c-bc13-515fad0fa257', 'adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 4, 'Frame Mount', 6),
       ('47bc4e6f-d1a3-4dbb-9c7a-7c47ed3c66f2', 'adce2efb-e7ef-4c5e-b31d-47a87b6b9cf6', 5, 'Wiring Loom', 5);

-- Entries for order_id: b1d43e99-80a2-4120-8c0d-9e646c2a70be
INSERT INTO bff_restful_services.dat_order_entries (id, order_id, position_number, position_name, position_quantity)
VALUES ('8a678fe4-d6a1-4e5e-87a6-607f330f4c88', 'b1d43e99-80a2-4120-8c0d-9e646c2a70be', 1, 'LCD Panel', 7),
       ('91b20b6a-e5f7-4415-9cf0-f3e3f32c3d6a', 'b1d43e99-80a2-4120-8c0d-9e646c2a70be', 2, 'Power Cord', 3),
       ('c36a4b2d-63fe-4cf4-bcd4-b2d9cfa158c5', 'b1d43e99-80a2-4120-8c0d-9e646c2a70be', 3, 'Button Panel', 5),
       ('8c3bfeeb-21a1-48a9-b23f-20ab29fe04ff', 'b1d43e99-80a2-4120-8c0d-9e646c2a70be', 4, 'Sensor Plate', 4),
       ('4b9ff1a1-df56-4382-b949-6ea7a3884f3e', 'b1d43e99-80a2-4120-8c0d-9e646c2a70be', 5, 'Touchscreen', 6);
