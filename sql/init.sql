create database crms;
create user 'crms_app'@'%' identified by 'Stealth28';
grant all on crms.* to 'crms_app'@'%';