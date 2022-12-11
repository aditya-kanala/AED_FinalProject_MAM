/*Use Daabase*/
use aed_project;

/*Admin Table*/
INSERT INTO `aed_project`.`admins`
(`UserName`, `Password`)
VALUES
('sadmin', 'sadmin'),('mpadmin','mpadmin'),('bpoadmin','bpoadmin'),('ladmin','ladmin'),('dadmin','dadmin');

/*Store Manager Table*/
INSERT INTO `aed_project`.`store_manager`
(`StoreID`, `StoreName`, `ManagerName`, `ManagerEmail`, `ManagerUserName`, `ManagerPassword`)
VALUES
(100, "CostCo", "Jacob", "jacob@costco.com", "jacob@costco","jacob123");

/*Warehouse Manager Table*/
INSERT INTO `aed_project`.`warehouse_manager`
(`WarehouseID`, `WarehouseName`, `ManagerName`, `ManagerEmail`, `ManagerUserName`, `ManagerPassword`)
VALUES
(100, "CostCo Warehouse", "Manuel" , "manuel@costco.com", "manuel@costco", "Manuel");

/*delete from warehouse_manager where WarehouseID = 100;*/

/*CSR Agent*/
INSERT INTO `aed_project`.`csr`
(`CSRID`, `CSRName`, `CSREmail`, `CSRPassword`)
VALUES
(100, "Robert", "robert@csr.com", "robert");

/*SSR Agent*/
INSERT INTO `aed_project`.`ssr`
(`SSRID`, `SSRName`, `SSREmail`, `SSRPassword`)
VALUES
(100, "Dustin", "dustin@ssr.com", "dustin");

/*Shipping Agent*/
INSERT INTO `aed_project`.`shipping_agent`
(`AgentName`, `AgentMobile`, `AgentBaseLocation`, `AgentUserName`, `AgentPassword`)
VALUES
("Mohit", 8573132407 , "Boston", "mohit@shippingagent", "mohit");

/*Store Items*/
INSERT INTO `aed_project`.`store_items`
(`ItemID`, `ItemName`, `ItemDescription`, `ItemPrice`, `ItemQuantity`)
VALUES
(1012, "Doritos" , "Flaming Hot", 5.69, 25);

/*Warehouse Order*/
INSERT INTO `aed_project`.`warehouse_orders`
(`OrderID`, `OrderDate`, `OrderItems`, `OrderTotal`)
VALUES
('100', '25 Oct 2022', 'Wheat', 1000);

/*User Order*/
INSERT INTO `aed_project`.`user_orders`
(`OrderID`, `OrderDate`, `OrderItems`, `OrderTotal`)
VALUES
('100', '01 Dec 2022', 'Mobile', 1100);

/*Supplier*/
INSERT INTO `aed_project`.`supplier`
(`SupplierName`, `SupplierEmail`, `SupplierLocation`, `SupplierMobile`, `SupplierUserName`, `SuppplierPassword`)
VALUES
('Mohith','mohith@gmail.com', 'LA',12345679890,'supplier1@supplier','supplier');

/*Shipment Order*/
INSERT INTO `aed_project`.`shipment_orders`
(`OrderID`, `OrderDate`, `OrderItems`, `OrderTotal`,`OrderStatus`)
VALUES
('100', '25 Oct 2022', 'Wheat', 1000,'Order Received');



