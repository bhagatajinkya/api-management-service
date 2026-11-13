-- Seed default management roles.
-- Uses ON CONFLICT to make the migration idempotent (safe to re-run).

INSERT INTO roles (name) VALUES ('PLATFORM_ADMIN')
ON CONFLICT (name) DO NOTHING;

INSERT INTO roles (name) VALUES ('TENANT_ADMIN')
ON CONFLICT (name) DO NOTHING;

INSERT INTO roles (name) VALUES ('GATEWAY_SERVICE')
ON CONFLICT (name) DO NOTHING;