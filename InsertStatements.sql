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

delete from warehouse_manager where WarehouseID = 100;

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
(`Item ID`, `Item Name`, `Item Description`, `Item Price`, `Item Quantity`)
VALUES
(1012, "Doritos" , "Flaming Hot", 5.69, 25);

/*Supply Order*/
INSERT INTO `aed_project`.`supply_orders`
(`Order ID`, `Order Date`, `Order Items`, `Order Total`)
VALUES
('100', '25 Oct 2022', 'Wheat', 1000);

/*User Order*/
INSERT INTO `aed_project`.`user_orders`
(`Order ID`, `Order Date`, `Order Items`, `Order Total`)
VALUES
('100', '01 Dec 2022', 'Mobile', 1100);


