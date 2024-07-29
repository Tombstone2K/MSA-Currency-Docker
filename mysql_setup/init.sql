CREATE TABLE metal_value (
    id INT PRIMARY KEY,
    metal_from VARCHAR(255) NOT NULL,
    currency_to VARCHAR(255) NOT NULL,
    conversion_multiple DECIMAL(15, 5) NOT NULL
);

INSERT INTO metal_value (id, metal_from, currency_to, conversion_multiple)
VALUES (101, 'GOLD', 'USD', 150.00000);

INSERT INTO metal_value (id, metal_from, currency_to, conversion_multiple)
VALUES (102, 'SILVER', 'USD', 112.00000);

INSERT INTO metal_value (id, metal_from, currency_to, conversion_multiple)
VALUES (103, 'PLATINUM', 'USD', 125.00000);

