CREATE TABLE pricing_settings
(
    id            BIGSERIAL PRIMARY KEY,

    free_distance INT       NOT NULL,
    base_fee      INT       NOT NULL,
    per_kg_rate   INT       NOT NULL,
    per_km_rate   INT       NOT NULL,
    urgent_fee    INT       NOT NULL,
    fragile_fee   INT       NOT NULL,

    created_at    TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_active     BOOLEAN   NOT NULL DEFAULT TRUE
);
