SELECT
f.airline airline,
f.type types2,
f.take_time take_time,
f.landing_time landing_time,
w1.airport_name airport_name_take,
w2.airport_name airport_name_landing,
f.flight_time flight_time,
w3.airport_name stop_airport,
chart.a a,chart.b b,
chart.c c
FROM
flights f
left join
airports w1
on
f.take_airport_id=w1.id
join
airports w2
on
f.landing_airport_id=w2.id
left join
airports w3
on
f.stop_airport=w3.id
left join
(select
flight_id id,
max(case when sell_company='驴妈妈' then ticket_price else 0 end) a,
max(case when sell_company='心悦会员' then ticket_price else 0 end) b,
max(case when sell_company='携程' then ticket_price else 0 end) c
from
flight_tickets
group by
flight_id) chart
on
chart.id=f.id
where
f.flight_date= #{take_time}
and
w1.airport_name like concat('%',#{take},'%')
and
w2.airport_name like concat('%',#{landing},'%')