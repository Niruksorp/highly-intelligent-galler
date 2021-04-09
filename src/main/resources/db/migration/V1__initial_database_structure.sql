alter table if exists personal_resume_skill_lis drop constraint if exists FKg1cdd6ywjr830mxemfhvc51n;
alter table if exists personal_resume_skill_lis drop constraint if exists FK7480gcbmu416f7nhvfkcod9ii;
alter table if exists project_vision drop constraint if exists FKkc8m95co5obhykvn4v5vjd5xr;
alter table if exists resume drop constraint if exists FKrkv1rf0njpm3djb1r47742vw1;
alter table if exists skill drop constraint if exists FK89kfuffmqg74cp5bt846qwepa;
drop table if exists app_user cascade;
drop table if exists personal_resume cascade;
drop table if exists personal_resume_skill_lis cascade;
drop table if exists project cascade;
drop table if exists project_vision cascade;
drop table if exists resume cascade;
drop table if exists skill cascade;
drop table if exists technical_issue cascade;
drop sequence if exists app_user_id_seq;
drop sequence if exists hibernate_sequence;
create sequence app_user_id_seq start 1 increment 1;
create sequence hibernate_sequence start 1 increment 1;
create table app_user
    (id int4 not null,
     username text not null,
      primary key (id)
    );
create table personal_resume (id int4 not null, bio text not null, email text not null, full_name text not null, link_to_social text not null, name text not null, patronymic text not null, surname text not null, primary key (id));
create table personal_resume_skill_lis (personal_resume_id int4 not null, skill_lis_id int4 not null, primary key (personal_resume_id, skill_lis_id));
create table project (id int4 not null, primary key (id));
create table project_vision (id int4 not null, key_ap int4, primary key (id));
create table resume (id int4 not null, project_type int4, key_ap int4, primary key (id));
create table skill (id int4 not null, tag text not null, parent_id int4, primary key (id));
create table technical_issue (id int4 not null, comment varchar(255), name_of_project varchar(255), planing_end_data timestamp, planing_start_data timestamp, primary key (id));
alter table if exists app_user add constraint UK_3k4cplvh82srueuttfkwnylq0 unique (username);
alter table if exists personal_resume add constraint UK_3s8inqk7344jjcrw48787cr8x unique (bio);
alter table if exists personal_resume add constraint UK_mmery6slktyc2u03ch38ik02s unique (email);
alter table if exists personal_resume add constraint UK_dsrirpiy21psgxe89tfy6gm3 unique (full_name);
alter table if exists personal_resume add constraint UK_oi8fwm7mu00n0ghik9cmiy5gb unique (link_to_social);
alter table if exists personal_resume add constraint UK_bi2axua5bse2c526jpjy2b89v unique (name);
alter table if exists personal_resume add constraint UK_he7oi5dg85f8lgw5csh8lr9ye unique (patronymic);
alter table if exists personal_resume add constraint UK_bm8v07c0w0ryhrnjgs2i3y6jf unique (surname);
alter table if exists personal_resume_skill_lis add constraint UK_am9qe1bbdvfcujtqavxgmsot unique (skill_lis_id);
alter table if exists skill add constraint UK_s5xrsw8oeolyf9w0txlc75y1d unique (tag);
alter table if exists personal_resume_skill_lis add constraint FKg1cdd6ywjr830mxemfhvc51n foreign key (skill_lis_id) references skill;
alter table if exists personal_resume_skill_lis add constraint FK7480gcbmu416f7nhvfkcod9ii foreign key (personal_resume_id) references personal_resume;
alter table if exists project_vision add constraint FKkc8m95co5obhykvn4v5vjd5xr foreign key (key_ap) references technical_issue;
alter table if exists resume add constraint FKrkv1rf0njpm3djb1r47742vw1 foreign key (key_ap) references project_vision;
alter table if exists skill add constraint FK89kfuffmqg74cp5bt846qwepa foreign key (parent_id) references personal_resume;