/*Drop Database if exists */
Drop database if exists aed_project;

 /*Create Database*/
CREATE DATABASE IF NOT EXISTS aed_project;

/*Use Database*/
use aed_project;

/*Admin Table*/
CREATE TABLE `admins` (
  `UserName` varchar(45) NOT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='All 4 enterprise plus system admin table\n';

/*CSR Table*/
CREATE TABLE `csr` (
  `CSRID` varchar(20) NOT NULL,
  `CSRName` varchar(45) DEFAULT NULL,
  `CSREmail` varchar(45) DEFAULT NULL,
  `CSRPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CSRID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Customer Table*/
CREATE TABLE `customer` (
  `CustomerName` varchar(45) NOT NULL,
  `CustomerEmail` varchar(45) DEFAULT NULL,
  `CustomerUserName` varchar(45) DEFAULT NULL,
  `CustomerMobile` bigint DEFAULT NULL,
  `CustomerPassword` varchar(45) DEFAULT NULL,
  `CustomerGender` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`CustomerName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Delivery Agent Table*/
CREATE TABLE `delivery_agent` (
  `AgentID` int NOT NULL,
  `AgentName` varchar(45) DEFAULT NULL,
  `AgentMobile` bigint DEFAULT NULL,
  `AgentBaseLocation` varchar(45) DEFAULT NULL,
  `AgentUserName` varchar(45) DEFAULT NULL,
  `AgentPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AgentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Farms Table*/
CREATE TABLE `farms` (
  `FarmName` varchar(45) NOT NULL,
  `FarmOwner` varchar(45) DEFAULT NULL,
  `FarmProduce` varchar(45) DEFAULT NULL,
  `FarmLocation` varchar(45) DEFAULT NULL,
  `FarmLongitude` double DEFAULT NULL,
  `FarmLatitude` double DEFAULT NULL,
  PRIMARY KEY (`FarmName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Shipping Agent*/
CREATE TABLE `shipping_agent` (
  `AgentName` varchar(45) NOT NULL,
  `AgentMobile` bigint DEFAULT NULL,
  `AgentBaseLocation` varchar(45) DEFAULT NULL,
  `AgentUserName` varchar(45) DEFAULT NULL,
  `AgentPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`AgentName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*SSR Table*/
CREATE TABLE `ssr` (
  `SSRID` varchar(20) NOT NULL,
  `SSRName` varchar(45) DEFAULT NULL,
  `SSREmail` varchar(45) DEFAULT NULL,
  `SSRPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SSRID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Store Table*/
CREATE TABLE `store` (
  `StoreID` int NOT NULL,
  `StoreName` varchar(45) DEFAULT NULL,
  `StoreLocation` varchar(45) DEFAULT NULL,
  `StoreLongitude` double DEFAULT NULL,
  `StoreLatitude` double DEFAULT NULL,
  PRIMARY KEY (`StoreID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='Store Table';

/*Store Manager Table*/
CREATE TABLE `store_manager` (
  `StoreID` int NOT NULL,
  `StoreName` varchar(45) DEFAULT NULL,
  `ManagerName` varchar(45) DEFAULT NULL,
  `ManagerEmail` varchar(45) DEFAULT NULL,
  `ManagerUserName` varchar(45) DEFAULT NULL,
  `ManagerPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`StoreID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Supplier Table*/
CREATE TABLE `supplier` (
  `SupplierName` varchar(45) NOT NULL,
  `SupplierEmail` varchar(45) DEFAULT NULL,
  `SupplierLocation` varchar(45) DEFAULT NULL,
  `SupplierMobile` bigint DEFAULT NULL,
  `SupplierUserName` varchar(45) DEFAULT NULL,
  `SuppplierPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`SupplierName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Warehouse Table*/
CREATE TABLE `warehouse` (
  `WarehouseID` int NOT NULL,
  `WarehouseName` varchar(45) DEFAULT NULL,
  `WarehouseType` varchar(45) DEFAULT NULL,
  `WarehouseLocation` varchar(45) DEFAULT NULL,
  `WarehouseLongitude` double DEFAULT NULL,
  `WarehouseLatitude` double DEFAULT NULL,
  PRIMARY KEY (`WarehouseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Warehouse Manager Table*/
CREATE TABLE `warehouse_manager` (
  `WarehouseID` int NOT NULL,
  `WarehouseName` varchar(45) DEFAULT NULL,
  `ManagerName` varchar(45) DEFAULT NULL,
  `ManagerEmail` varchar(45) DEFAULT NULL,
  `ManagerUserName` varchar(45) DEFAULT NULL,
  `ManagerPassword` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`WarehouseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Store Items Table*/
CREATE TABLE `store_items` (
  `ItemID` varchar(20) NOT NULL,
  `ItemName` varchar(45) DEFAULT NULL,
  `ItemDescription` varchar(45) DEFAULT NULL,
  `ItemPrice` double DEFAULT NULL,
  `ItemQuantity` int DEFAULT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Warehouse Order Table*/
CREATE TABLE `warehouse_orders` (
  `OrderID` varchar(20) NOT NULL,
  `OrderDate` varchar(20) DEFAULT NULL,
  `OrderItems` varchar(45) DEFAULT NULL,
  `OrderTotal` double DEFAULT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE user_orders;

/*User Order Table*/
CREATE TABLE `user_orders` (
  `OrderID` varchar(20) NOT NULL,
  `OrderDate` varchar(20) DEFAULT NULL,
  `OrderItems` varchar(45) DEFAULT NULL,
  `OrderTotal` double DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  `long` varchar(100) DEFAULT NULL,
  `lat` varchar(100) DEFAULT NULL,
  `zoom` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Shipment Table*/
CREATE TABLE `shipment_orders` (
  `OrderID` varchar(20) NOT NULL,
  `OrderDate` varchar(20) DEFAULT NULL,
  `OrderItems` varchar(45) DEFAULT NULL,
  `OrderTotal` double DEFAULT NULL,
  `OrderStatus` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


/*cart Table*/
CREATE TABLE `cart` (
  `product` varchar(20) NOT NULL,
  `price` double DEFAULT NULL,
  `quantity` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Shipping Agent*/
CREATE TABLE `delivery_agent` (
  `OrderID` varchar(45) NOT NULL,
  `OrderDate` bigint DEFAULT NULL,
  `OrderItems` varchar(45) DEFAULT NULL,
  `OrderTotal` varchar(45) DEFAULT NULL,
  `OrderStatus` varchar(45) DEFAULT NULL,		
  PRIMARY KEY (`AgentName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;