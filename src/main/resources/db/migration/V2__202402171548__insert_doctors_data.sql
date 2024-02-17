INSERT INTO doctor (name, contact, is_online_bookable, description, rating)
VALUES
    ('Dr. Smith', '123-456-7890', true, 'Experienced cardiologist', 4.5),
    ('Dr. Johnson', '987-654-3210', true, 'Pediatrician with a caring approach', 4.8),
    ('Dr. Williams', '555-123-4567', false, 'Orthopedic surgeon specializing in sports injuries', 4.2),
    ('Dr. Davis', '111-222-3333', true, 'Family medicine practitioner', 4.6);

INSERT INTO diagnostic_centers (name, longitude, latitude, description)
VALUES
  ('Medical Center A', 40.7128, -74.0060, 'State-of-the-art medical facility'),
  ('Wellness Clinic B', 34.0522, -118.2437, 'Holistic wellness clinic'),
  ('City Hospital C', 41.8781, -87.6298, 'Comprehensive healthcare services'),
  ('Urgent Care D', 30.2672, -97.7431, 'Immediate medical attention'),
  ('Community Health Center E', 37.7749, -122.4194, 'Promoting community well-being');


INSERT INTO availability (day_of_week, start_time, end_time)
VALUES
  ('Monday', '09:00 AM', '05:00 PM'),
  ('Tuesday', '10:00 AM', '06:00 PM'),
  ('Wednesday', '08:30 AM', '04:30 PM'),
  ('Thursday', '11:00 AM', '07:00 PM'),
  ('Friday', '09:30 AM', '05:30 PM');


INSERT INTO doctor_diagnostic_centers (doctor_id, diagnostic_center_id, availability)
VALUES
  (1, 1, 1),
  (1, 2, 2),
  (2, 3, 3),
  (2, 4, 4),
  (3, 5, 5);
