INSERT IGNORE INTO role (id, read_patient, read_provider, write_patient, write_provider)
VALUES  ('PATIENT', true, true, true, false),
        ('PROVIDER', true, true, false, true),
        ('SUPER_ADMIN', true, true, true, true);