//drop table if exists tb_word;
//drop table if exists tb_word_hist;


CREATE TABLE tb_word (
  id integer  PRIMARY KEY,
  portal varchar(10) NOT NULL,
  type varchar(10) NOT NULL,
  crawler_time TIMESTAMP NOT NULL,
  rank_index int,
  search_word varchar(100),
  relation_word varchar(200)
);


CREATE TABLE tb_word_hist (
  word_id varchar(30) PRIMARY KEY,
  portal varchar(10) NOT NULL,
  type varchar(10) NOT NULL,
  crawler_time TIMESTAMP,
  rank_index int(255),
  search_word varchar(100),
  relation_word varchar(200)
);