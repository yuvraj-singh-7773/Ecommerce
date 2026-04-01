CREATE TABLE product (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,

                         image VARCHAR(255),
                         color VARCHAR(100),
                         price INT,
                         description TEXT,
                         discount INT,
                         model VARCHAR(255),
                         title VARCHAR(255),
                         brand VARCHAR(255),
                         popular BOOLEAN,

                         category_id BIGINT NOT NULL,

                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

                         CONSTRAINT fk_product_category
                             FOREIGN KEY (category_id)
                                 REFERENCES category(id)
                                 ON DELETE CASCADE
);